import StudentList from "../../components/training/Q8_StudentList";

function StudentPage() {
    const students = [
        {name : "김학생", score: 90},
        {name : "이학생", score: 80}
    ]
    return(
        <div>
            <StudentList students={students}/>
        </div>
    );
}

export default StudentPage;