// src/summarizer.ts
import { SourceItem, Summary } from "./types";
import { classify } from "./fetcher";

export function summarize(item: SourceItem): Summary {
  const t = (item.title + " " + item.text).toLowerCase();
  let score = 0;
  let rationale: string[] = [];

  if (t.includes("usd strength") || t.includes("dollar strengthened") || t.includes("risk-off")) {
    score -= 1;
    rationale.push("USD safe-haven / strength");
  }
  if (t.includes("ecb cautious") || t.includes("services inflation")) {
    score -= 0.5;
    rationale.push("ECB cautious, euro upside capped");
  }
  if (t.includes("fed easing") || t.includes("rate cut")) {
    score += 0.5;
    rationale.push("Fed easing bias");
  }
  if (t.includes("eurozone growth") && t.includes("weak")) {
    score -= 0.5;
    rationale.push("Eurozone weak growth");
  }

  return {
    facts: [item.title, item.text.slice(0, 100) + "..."],
    impact: {
      score: Math.max(-2, Math.min(2, score)),
      confidence: rationale.length > 1 ? 0.75 : 0.6,
      rationale: rationale.join("; "),
    },
    tags: classify(item),
  };
}
