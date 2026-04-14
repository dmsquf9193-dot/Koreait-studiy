import ReactMarkdown from "react-markdown";
import { genreOptions, levelOptions, purposeOptions } from "../data/options";
import { useRecommendationStore } from "../store/useRecommendationStore";
import { useRecommendationMutation } from "../hooks/useRecommendationMutation";

function MarkdownResult({ markdown }) {
  return (
    <section className="mb-16 border-l-4 border-primary/20 pl-8 py-4">
      <div className="markdown-content bg-surface-container-low/50 p-8 rounded-lg">
        <div className="flex items-center gap-2 mb-4 text-primary">
          <span className="material-symbols-outlined">psychology</span>
          <span className="text-sm font-bold font-label tracking-widest uppercase">AI Response</span>
        </div>
        <ReactMarkdown>{markdown}</ReactMarkdown>
      </div>
    </section>
  );
}

export function HomePage() {
  const form = useRecommendationStore((state) => state.form);
  const resultMarkdown = useRecommendationStore((state) => state.resultMarkdown);
  const setField = useRecommendationStore((state) => state.setField);
  const recommendationMutation = useRecommendationMutation();

  const handleSubmit = (event) => {
    event.preventDefault();
    recommendationMutation.mutate();
  };

  return (
    <main className="max-w-5xl mx-auto px-6 py-16 md:py-24">
      <section className="text-center mb-16 md:mb-24">
        <h1 className="font-headline text-5xl md:text-7xl font-extrabold tracking-tight text-on-surface mb-6 leading-tight">
          AI 도서 추천 서비스
        </h1>
        <p className="text-lg md:text-xl text-on-surface-variant max-w-2xl mx-auto font-body">
          당신의 취향과 목적을 분석해 가장 잘 맞는 책을 추천합니다. 지금의 관심사에 정확히 맞닿는 다음 읽을거리를 골라보세요.
        </p>
      </section>

      <section className="relative mb-24">
        <div className="absolute -top-12 -left-12 w-64 h-64 bg-primary-container/20 rounded-full blur-3xl -z-10"></div>
        <div className="absolute -bottom-12 -right-12 w-64 h-64 bg-secondary-container/30 rounded-full blur-3xl -z-10"></div>
        <div className="bg-surface-container-lowest p-8 md:p-12 rounded-DEFAULT shadow-[0px_12px_32px_rgba(49,50,59,0.06)]">
          <form className="grid grid-cols-1 md:grid-cols-3 gap-8" onSubmit={handleSubmit}>
            <div className="space-y-2">
              <label className="block text-sm font-semibold text-on-surface-variant font-label">장르</label>
              <select
                className="w-full bg-surface-container-low border-none rounded-DEFAULT py-4 px-4 text-on-surface focus:ring-2 focus:ring-primary/20 transition-all cursor-pointer"
                value={form.genre}
                onChange={(event) => setField("genre", event.target.value)}
              >
                {genreOptions.map((option) => (
                  <option key={option}>{option}</option>
                ))}
              </select>
            </div>

            <div className="space-y-2">
              <label className="block text-sm font-semibold text-on-surface-variant font-label">추천 목적</label>
              <select
                className="w-full bg-surface-container-low border-none rounded-DEFAULT py-4 px-4 text-on-surface focus:ring-2 focus:ring-primary/20 transition-all cursor-pointer"
                value={form.purpose}
                onChange={(event) => setField("purpose", event.target.value)}
              >
                {purposeOptions.map((option) => (
                  <option key={option}>{option}</option>
                ))}
              </select>
            </div>

            <div className="space-y-2">
              <label className="block text-sm font-semibold text-on-surface-variant font-label">난이도</label>
              <select
                className="w-full bg-surface-container-low border-none rounded-DEFAULT py-4 px-4 text-on-surface focus:ring-2 focus:ring-primary/20 transition-all cursor-pointer"
                value={form.level}
                onChange={(event) => setField("level", event.target.value)}
              >
                {levelOptions.map((option) => (
                  <option key={option}>{option}</option>
                ))}
              </select>
            </div>

            <div className="md:col-span-3 space-y-2">
              <label className="block text-sm font-semibold text-on-surface-variant font-label">상세 요청 사항</label>
              <textarea
                className="w-full bg-surface-container-low border-none rounded-DEFAULT py-4 px-4 text-on-surface focus:ring-2 focus:ring-primary/20 transition-all resize-none"
                placeholder="찾고 있는 책의 분위기, 최근 관심사, 피하고 싶은 주제 등을 자유롭게 적어주세요."
                rows="4"
                value={form.description}
                onChange={(event) => setField("description", event.target.value)}
              />
            </div>

            <div className="md:col-span-3 flex flex-col items-center gap-6 mt-4">
              <button
                className="w-full md:w-auto px-12 py-4 bg-gradient-to-r from-primary to-primary-dim text-on-primary font-bold rounded-full shadow-lg hover:scale-[0.98] transition-all duration-300"
                type="submit"
              >
                추천받기
              </button>
              {recommendationMutation.isPending ? (
                <div className="flex items-center gap-3 text-primary animate-pulse">
                  <span className="material-symbols-outlined text-lg">auto_awesome</span>
                  <span className="text-sm font-medium font-label uppercase tracking-widest">
                    AI가 당신을 위한 책을 찾고 있습니다...
                  </span>
                </div>
              ) : null}
              {recommendationMutation.isError ? (
                <p className="text-sm text-error">API 응답을 가져오지 못해 현재는 기본 마크다운 결과를 보여줍니다.</p>
              ) : null}
            </div>
          </form>
        </div>
      </section>

      <MarkdownResult markdown={resultMarkdown} />
    </main>
  );
}
