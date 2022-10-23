import { Component } from "@angular/core";
import { FormGroup } from "@angular/forms";
import { StorageComponent } from "./pages/storage/storage.component";

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.css"],
})
export class AppComponent {
  title = "frontend";
  loginForm: FormGroup;
  tableData = [];

  constructor(public storageService: StorageComponent) {}

  ngOnInit() {
    this.createForm();
    this.tableData = this.storageService.gerateData();
  }

  createForm() {}

  onKeepSigned() {}

  onSubmit() {}
}
