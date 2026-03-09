
function Result(props) {
    const student = props.student;

    return(
        <div>
            <h3>
                {student.name} - {student.score >= 60 ? "합격" : "불합격"}
            </h3>
        </div>
    );
}

export default Result;