import { Injectable } from '@angular/core';
import { Item } from './model/Item';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ItemService {
    url:string;
    item : Item;
  constructor(private http : HttpClient) { 
    this.url = "http://localhost:3005/employees";
    this.item = new Item();
  }
  editManage(item : Item){
    this.http.put<Item>(this.url,item).subscribe();
    return " Items Updated";
  }
}
