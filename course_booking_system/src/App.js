import './App.css';
import { useEffect, useState } from 'react';

function App() {

  const [courses, setCourses] = useState([])

  useEffect(() => {
    fetch ("http://localhost:8080/courses")
    .then(res => res.json())
    .then((courses) => {
    setCourses(courses)
    })
  })

  const allCourses = courses.map((course) => {
    return <li>{course.name}</li>
  })

  return (
    <div className="App">
      <header>Welcome!</header>
      <div class="coursesheader">
        <ul class="courses">Courses:
          {allCourses}
          <b></b>
        </ul>
      </div>

    </div>
  );

};

export default App;
