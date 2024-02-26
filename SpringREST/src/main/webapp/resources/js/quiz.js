rbtn1.addEventListener('click', (e)=>{
    const xhttp = new XMLHttpRequest();
    xhttp.addEventListener('readystatechange', (e)=>{
        if(xhttp.readyState === 4 && xhttp.status == 200){
            console.dir(xhttp); 
            console.log(xhttp.responseText); 

            const cargo = xhttp.responseText;
            // JSON은 Javascript Object 형식의 문자열이지 오브젝트가 아니다
            // 오브젝트로 변환하는 과정이 필요하다
            console.log(cargo);
            console.log(typeof cargo); // string

            const obj = JSON.parse(cargo);
            console.log(obj);
            console.log("employee_id: " , obj.employee_id);
            console.log("first_name: " , obj.first_name);
            console.log("last_name: " , obj.last_name);
 
            
            const newEmpId = document.createElement('div');
            const newFname = document.createElement('div');
            const newLname = document.createElement('div');

            newEmpId.classList.add('emp-id');
            newFname.classList.add('emp-fname');
            newLname.classList.add('emp-lname');

            newEmpId.innerText = obj.employee_id;
            newFname.innerText = obj.first_name;
            newLname.innerText = obj.last_name;



            emps.appendChild(newEmpId);
            emps.appendChild(newFname);
            emps.appendChild(newLname);
        }                   
    });
    xhttp.open('GET', './quiz/r1');
    xhttp.send();
});