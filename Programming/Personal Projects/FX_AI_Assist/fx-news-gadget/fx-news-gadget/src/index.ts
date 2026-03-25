// src/index.ts
import { fetchNews } from "./fetcher";
import { summarize } from "./summarizer";
import { buildOutlook } from "./outlook";

async function main() {
  const news = await fetchNews();
  const summaries = news.map(summarize);

  console.log("=== Intraday Summaries ===");
  summaries.slice(0, 5).forEach((s) => {
    console.log("- Facts:", s.facts.join(" | "));
    console.log("  Impact:", s.impact);
    console.log("  Tags:", s.tags);
  });

  console.log("\n=== Outlook ===");
  console.log(buildOutlook(summaries));
}

main();
