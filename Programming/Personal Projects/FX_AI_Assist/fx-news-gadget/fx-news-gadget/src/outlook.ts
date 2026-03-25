// src/outlook.ts
import { Summary, Outlook } from "./types";

export function buildOutlook(summaries: Summary[]): Outlook[] {
  let usdStrength = 0;
  let euroWeakness = 0;
  let fedEasing = 0;

  summaries.forEach((s) => {
    if (s.impact.rationale.includes("USD safe-haven")) usdStrength += s.impact.confidence;
    if (s.impact.rationale.includes("Eurozone weak growth")) euroWeakness += s.impact.confidence;
    if (s.impact.rationale.includes("Fed easing bias")) fedEasing += s.impact.confidence;
  });

  const q4: Outlook = {
    horizon: "Q4-2025",
    bias: usdStrength > euroWeakness ? "Weaken" : "Flat",
    drivers: ["USD safe-haven flows", "Eurozone weak growth"],
    confidence: 0.7,
  };

  const h1: Outlook = {
    horizon: "H1-2026",
    bias: fedEasing > usdStrength ? "Strengthen" : "Flat",
    drivers: ["Fed easing bias", "Gradual EU recovery"],
    confidence: 0.65,
  };

  return [q4, h1];
}
