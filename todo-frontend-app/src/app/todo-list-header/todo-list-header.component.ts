import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import {Todo} from '../_models/todo';

@Component({
  selector: 'app-todo-list-header',
  templateUrl: './todo-list-header.component.html',
  styleUrls: ['./todo-list-header.component.scss']
})
export class TodoListHeaderComponent implements OnInit {

  newTodo: Todo = new Todo();
  dueDate: Date = new Date();

  @Output()
  add: EventEmitter<Todo> = new EventEmitter();

  constructor() { }

  ngOnInit(): void {
    this.newTodo.dueDate = new Date();
  }

  addTodo() {
    this.add.emit(this.newTodo);
    this.newTodo = new Todo();
  }


}
