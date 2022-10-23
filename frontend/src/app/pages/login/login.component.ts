import { Component, OnInit } from "@angular/core";
import { FormGroup } from "@angular/forms";
import { Router } from "@angular/router";
import { Product } from "src/app/models/product.models";
import { StorageService } from "src/app/services/storage/storage.service";

@Component({
  selector: "app-login",
  templateUrl: "./login.component.html",
  styleUrls: ["./login.component.css"],
})
export class LoginComponent implements OnInit {
  constructor(private router: Router, private storageService: StorageService) {}

  title = "frontend";
  products: Product[] = [];

  loginForm: FormGroup;

  ngOnInit() {
    this.createForm();
    this.products = this.storageService.getProducts();
  }

  createForm() {}

  onKeepSigned() {}

  onSubmit() {
    this.router.navigate(["NOME DA ROTA QUE ESTA NO ARQUIVO DE ROTAS"]);
  }
}
