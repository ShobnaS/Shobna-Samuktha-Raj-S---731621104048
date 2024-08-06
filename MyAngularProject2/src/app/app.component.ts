import { Component } from '@angular/core';
import { Item } from './model/Item';
import { ItemService } from './item.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
     //flag : boolean;
     myClass : string;
     search : string;
     myStyle : {};
     myClass1 : string;
     myClass2 : string;
     item : Item;
     result : string;
     constructor(private service : ItemService){
     // this.flag = true;
      this.myClass ="MyClass1";
      this.search="";
      this.myStyle = {'width':'100%','height':'200px'};
      this.myClass1 = "MyClass2";
      this.myClass2 = "MyClass3";
      this.item = new Item();
      this.result = "";

     }
    editManage(data:any){
        this.item.itemName = data.itemName;
        this.item.id = data.itemId;
        this.item.itemQuantity = data.itemQuantity;
        this.item.itemPrice = data.itemPrice;
        alert(data.itemName+" "+data.itemId+" "+data.itemQuantity+" "+data.itemPrice);
        this.result = this.service.editManage(this.item);
    }
}
