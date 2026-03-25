// src/fetcher.ts
import Parser from "rss-parser";
import { SourceItem } from "./types";

type RSSItem = {
  title: string;
  link: string;
  pubDate?: string;
  contentSnippet?: string;
};

const parser: Parser<RSSItem> = new Parser<RSSItem>();

// Fetch from multiple feeds
export async function fetchNews(): Promise<SourceItem[]> {
  const feeds = [
    { url: "https://www.fxstreet.com/rss/news", source: "FXStreet" },
    { url: "https://www.investing.com/rss/news_25.rss", source: "Investing.com" },
    { url: "https://www.newsnow.co.uk/h/Business+&+Finance/Currencies/EUR~USD/rss", source: "NewsNow" },
    { url: "https://feeds.finance.yahoo.com/rss/2.0/headline?s=EURUSD=X&region=US&lang=en-US", source: "Yahoo Finance" },
  ];

  let results: SourceItem[] = [];

  for (const feed of feeds) {
    try {
      const parsed = await parser.parseURL(feed.url);
      parsed.items.forEach((item) => {
        results.push({
          title: item.title ?? "",
          text: item.contentSnippet ?? "",
          source: feed.source,
          publishedAt: item.pubDate ?? new Date().toISOString(),
          url: item.link ?? "",
        });
      });
    } catch (err) {
      console.error(`Failed to fetch ${feed.source}:`, err);
    }
  }

  return results;
}

// Classify news into categories
export function classify(item: SourceItem): string[] {
  const t = (item.title + " " + item.text).toLowerCase();
  const tags: string[] = [];
  if (t.includes("ecb") || t.includes("eurozone") || t.includes("inflation"))
    tags.push("Macro", "Policy");
  if (t.includes("fed") || t.includes("powell")) tags.push("Policy");
  if (t.includes("turmoil") || t.includes("shutdown") || t.includes("risk-off"))
    tags.push("Risk");
  if (t.includes("support") || t.includes("resistance") || t.includes("ema"))
    tags.push("Technical");
  return Array.from(new Set(tags));
}
