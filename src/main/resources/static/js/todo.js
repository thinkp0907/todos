const todoInputElem = document.querySelector('.todo-input');
const todoListElem = document.querySelector('.todo-list');

window.onload = function(){
    const todoListElem = document.querySelector('.todo-list');
    let todoList = "";

    //요청을 보낼 방식, url, 비동기여부 설정
    fetch("http://localhost:8080/todos",{
        method: "GET",
    }).then((response) => response.json())
        .then((data) => data.forEach(function (index) {

            const todoItemElem = document.createElement('li');
            todoItemElem.classList.add('todo-item');

            // todoItemElem.setAttribute('data-id', todo.id );
            const checkboxElem = document.createElement('div');
            checkboxElem.classList.add('checkbox');

            const todoElem = document.createElement('div');
            todoElem.classList.add('todo');
            console.log(data[index]);
            todoElem.innerText = data[index].content;

            const delBtnElem = document.createElement('button');
            delBtnElem.classList.add('delBtn');
            delBtnElem.innerHTML = 'X';

            todoItemElem.appendChild(checkboxElem);
            todoItemElem.appendChild(todoElem);
            todoItemElem.appendChild(delBtnElem);

            todoListElem.appendChild(todoItemElem);
        }));


}

