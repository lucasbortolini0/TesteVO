import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";
import { StorageComponent } from "./storage.component";
import { MatTableModule } from "@angular/material/table";
import { MatFormFieldModule } from "@angular/material/form-field";

@NgModule({
  declarations: [StorageComponent],
  imports: [BrowserModule, MatTableModule, MatFormFieldModule],
  exports: [StorageComponent],
  bootstrap: [StorageComponent],
})
export class StorageModule {}
