// src/types.ts

// Raw news item fetched from RSS feeds
export type SourceItem = {
  title: string;
  text: string;
  source: string;
  publishedAt: string;
  url: string;
};

// Summarized + scored news
export type Summary = {
  facts: string[];
  impact: {
    score: number;        // -2 (EUR↓) to +2 (EUR↑)
    confidence: number;   // 0–1
    rationale: string;    // explanation
  };
  tags: string[];
};

// Medium-term outlook
export type Outlook = {
  horizon: "Q4-2025" | "H1-2026" | string;
  bias: "Strengthen" | "Weaken" | "Flat";
  drivers: string[];
  confidence: number;
};
