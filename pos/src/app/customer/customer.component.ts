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
      this.getAllCustomer();

  }

  getAllCustomer(){
    this.http.get("http://localhost:8082/api/v1/employee/getAllEmployee").subscribe((resultDate:any)=>{
      this.isResultReloaded=resultDate;
      console.log(resultDate);
      this.EmployeeArray=resultDate;
    })
  }


}
