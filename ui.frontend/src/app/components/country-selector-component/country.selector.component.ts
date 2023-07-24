import { Component, Input, OnInit } from '@angular/core';
import { MapTo } from '@adobe/cq-angular-editable-components';


interface Country {
  name?: string;
  code?: string;
  image?: string;
}

const CustomEditConfig = {
  emptyLabel: 'Country Selector Component',
  isEmpty: cqModel =>
    !cqModel || !cqModel.originalCountries
};

@Component({
  selector: 'app-country-selector',
  templateUrl: './country.selector.component.html',
  styleUrls: ['./country.selector.component.scss']
})
export class CountrySelectorComponent implements OnInit {

  @Input() originalCountries: Country[] = [];
  countries: Country[] = [];
  count: number;

  constructor() {
     this.count = 0;
  }

  ngOnInit(): void {
      // this.countries = Array.from(this.originalCountries);
  }

  updateCountryList(filterVal: string): Country[] {
    const countriesArray: Country[] = [];
    this.originalCountries.forEach((country) => {
          if (country.name.toLowerCase().indexOf(filterVal) > -1 ) {
            countriesArray.push(country);
          }
    });
    return countriesArray;
  }

  inputChange(event: any ) {
    const filterValue = event.target.value.toLowerCase();
    if (filterValue === '' ) {
      this.countries = [];
    } else {
      this.countries = this.updateCountryList(filterValue);
    }
  }

  inputClick() {
    this.countries = Array.from(this.originalCountries);
  }

  mouseOut() {
    this.countries = [];
  }
}

MapTo('wknd-spa-angular/components/country-selector-component')(CountrySelectorComponent, CustomEditConfig);

