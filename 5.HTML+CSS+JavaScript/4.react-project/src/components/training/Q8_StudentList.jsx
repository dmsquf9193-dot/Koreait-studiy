
function StudentList(props) {
    return(
        <div>
            {props.students.map((student, index) => ( 
            <p key={index}>
                {student.name} - {student.score}점
            </p>
            ))}
        </div>
    );
}

export default StudentList;