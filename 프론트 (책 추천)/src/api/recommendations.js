import { http } from "./http";

function extractMarkdown(data) {
  if (typeof data === "string") {
    return data;
  }

  if (!data || typeof data !== "object") {
    return "";
  }

  return (
    data.markdown ||
    data.response ||
    data.content ||
    data.message ||
    data.result ||
    data.text ||
    data.answer ||
    data.insightMarkdown ||
    ""
  );
}

export async function fetchRecommendations(payload) {
  const { data } = await http.post("/gpt/generate", payload);

  return {
    markdown: extractMarkdown(data)
  };
}
