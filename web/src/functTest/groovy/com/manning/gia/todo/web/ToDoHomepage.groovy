package com.manning.gia.todo.web

import geb.*

class ToDoHomepage extends Page {
    static url = "http://localhost:8081/todo"
    static at = { title == "To Do application" }
}