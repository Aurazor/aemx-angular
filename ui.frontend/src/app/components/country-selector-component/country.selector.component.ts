import { Component, Input, OnInit } from '@angular/core';
import { MapTo } from '@adobe/cq-angular-editable-components';

const CustomEditConfig = {
  emptyLabel: 'Country Selector Component',
  isEmpty: cqModel =>
    !cqModel || !cqModel.message || cqModel.message.trim().length < 1
};

@Component({
  selector: 'app-country-selector',
  templateUrl: './country.selector.component.html',
  styleUrls: ['./country.selector.component.css']
})
export class CountrySelectorComponent implements OnInit {

  @Input() message: string;

  constructor() { }

  ngOnInit(): void {
  }

}

MapTo('wknd-spa-angular/components/country-selector-component')(CountrySelectorComponent, CustomEditConfig);

