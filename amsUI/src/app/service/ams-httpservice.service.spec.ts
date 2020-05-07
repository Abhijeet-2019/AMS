import { TestBed } from '@angular/core/testing';

import { AmsHTTPServiceService } from './ams-httpservice.service';

describe('AmsHTTPServiceService', () => {
  let service: AmsHTTPServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AmsHTTPServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
