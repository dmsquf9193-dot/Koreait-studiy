import { useMutation } from "@tanstack/react-query";
import { fetchRecommendations } from "../api/recommendations";
import { useRecommendationStore } from "../store/useRecommendationStore";

export function useRecommendationMutation() {
  const form = useRecommendationStore((state) => state.form);
  const setRecommendations = useRecommendationStore((state) => state.setRecommendations);

  return useMutation({
    mutationFn: () => fetchRecommendations(form),
    onSuccess: (data) => {
      setRecommendations({
        markdown: data?.markdown
      });
    }
  });
}
