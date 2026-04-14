import { create } from "zustand";
import { initialMarkdown } from "../data/mockContent";

const defaultForm = {
  genre: "소설",
  purpose: "힐링/위로",
  level: "입문",
  description: ""
};

export const useRecommendationStore = create((set) => ({
  form: defaultForm,
  resultMarkdown: initialMarkdown,
  setField: (field, value) =>
    set((state) => ({
      form: {
        ...state.form,
        [field]: value
      }
    })),
  setRecommendations: ({ markdown }) =>
    set(() => ({
      resultMarkdown: markdown || initialMarkdown
    }))
}));
