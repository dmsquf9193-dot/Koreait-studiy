import Result from "../../components/training/Q9_Result";

function ResultPage() {
    const student = {name: "홍길동", score: 75};
    return(
        <div>
            <Result student={student}/>
        </div>
    );
}

export default ResultPage;