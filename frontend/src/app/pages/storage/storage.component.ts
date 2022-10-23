import { Component } from "@angular/core";
import { MatTableDataSource } from "@angular/material/table";

export interface PeriodicElement {
  id: number;
  cod_bar: string;
  name: string;
  qtd_min: number;
  sald_min: number;
}

const ELEMENT_DATA: PeriodicElement[] = [
  { id: 1, cod_bar: "1010101", name: "Colar", qtd_min: 5, sald_min: 8 },
  { id: 2, cod_bar: "2121212", name: "Anel", qtd_min: 6, sald_min: 20 },
  { id: 3, cod_bar: "3232323", name: "Laços", qtd_min: 21, sald_min: 6 },
  { id: 4, cod_bar: "4343434", name: "Botas", qtd_min: 28, sald_min: 30 },
  { id: 5, cod_bar: "5454545", name: "Cuecas", qtd_min: 62, sald_min: 72 },
  { id: 6, cod_bar: "6565656", name: "Meias", qtd_min: 82, sald_min: 8 },
  { id: 7, cod_bar: "7676767", name: "Shorts", qtd_min: 12, sald_min: 52 },
  { id: 8, cod_bar: "8787878", name: "Blusas", qtd_min: 62, sald_min: 23 },
  { id: 9, cod_bar: "9898989", name: "Boné", qtd_min: 2, sald_min: 20 },
  { id: 10, cod_bar: "9109101", name: "Vestido", qtd_min: 52, sald_min: 66 },
  { id: 11, cod_bar: "1110111", name: "Moletons", qtd_min: 47, sald_min: 12 },
];

@Component({
  selector: "app-storage",
  templateUrl: "./storage.component.html",
  styleUrls: ["./storage.component.css"],
})
export class StorageComponent {
  displayedColumns: string[] = ["id", "cod_bar", "name", "qtd_min", "sald_min"];
  dataSource = new MatTableDataSource(ELEMENT_DATA);

  constructor() {}

  gerateData(): any[] {
    var data: any[] = [];

    ELEMENT_DATA.forEach((element) => {
      var row = {};
      (row["id"] = element.id),
        (row["name"] = element.name),
        (row["qtd_min"] = element.qtd_min),
        (row["sald_min"] = element.sald_min),
        (row["cod_bar"] = element.cod_bar);

      data.push(row);
    });

    return data;
  }

  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }
}
