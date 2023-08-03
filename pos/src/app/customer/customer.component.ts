import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent {
  EmployeeArray :any[]=[];

  isResultReloaded=false;
  isUpdateFormActive=false;

  name: string="";
  address: string="";
  mobile: Number=0;

  currentEmployeID="";

  constructor(private http:HttpClient){
      this.getAllEmployee();

  }

  getAllEmployee(){
    this.http.get("http://localhost:8082/api/v1/employee/getAllEmployee").subscribe((resultData:any)=>{
      this.isResultReloaded=resultData;
      console.log(resultData);
      this.EmployeeArray=resultData;
    })
  }

  register(){

    let bodyData={
      "name":this.name,
      "address":this.address,
      "mobile":this.mobile
    };

    this.http.post("http://localhost:8082/api/v1/employee/save",bodyData,{responseType:'text'}).subscribe((resultData:any)=>{
      console.log(resultData);
      alert("Employee Added Succuss");
      this.getAllEmployee();


      this.name='';
      this.address='';
      this.mobile=0;
    })
  }

}
