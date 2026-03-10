import { create } from "zustand"


const useGugudanStore = create((set) => ({
    a: "",
    b: "",
    answer: "",
    result: "",

    setA: (value) => set({a: value}),
    setB: (value) => set({b: value}),
    setAnswer: (value) => set({answer: value}),

    checkAnswer: (a, b, answer) => {
        if (Number(answer) === Number(a) * Number(b)) {
            set({ result: "정답입니다!"});
        } else {
            set({ result: "오답입니다!"});
        }
    },
    reset: () =>
        set({
            a: "",
            b: "", 
            answer: "",
            result: "",
        }),
}));

export default useGugudanStore;