import { Injectable } from "@angular/core";
import { products } from "src/app/data";

@Injectable({
  providedIn: "root",
})
export class StorageService {
  constructor() {}

  getProducts() {
    return products;
  }
}
