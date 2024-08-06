import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
//     // name : string;
//     // age : number;
//     // email : string;
//     // imagePath : string;
//     // fname : string;
//     // constructor(){
//     //   this.name = "Shobna";
//     //   this.age= 20;
//     //   this.email="ghfgn";
//     //   this.imagePath="MyAngularProject1/src/assests/logo1.png";
//     //   this.fname = "";
//     // }
//     flag : boolean;
//     vehicles ;
//     selectedVehicle :string;
//     myStyle : {};
//     myClass : string;
//     constructor(){
//       this.flag=true;
//       this.vehicles=["two Wheeler","three wheeler","Four wheeler"];
//       this.selectedVehicle="";
//       this.myStyle ={'width': '20%','border':'2px solid pink','border-radius':'30px','height':'200px'};
//       this.myClass ="MyClass1";
//       }
//     changeFlag(){
//       this.flag=!this.flag;
//     }
//     setSelectedItem(vec:string){
//       this.selectedVehicle=vec;
//     }
//     changeStyle(){
//        this.myStyle ={'width': '20%','border':'2px solid blue','border-radius':'30px','height':'200px'};
//     }

// }
    // sum : number;
   sub : number;
     constructor(private calc : CalculatorService){
    //this.sum = calc.getAddition(10,20);
     this.sub = calc.getSubtraction(60,10);
     }   
}
