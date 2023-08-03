import { Component } from '@angular/core';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent {
  EmployeeArray :any[]=[];



  employeeName: string="";
  employeeAdderss: string="";
  mobile: Number=0;


}
