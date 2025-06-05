import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LiderLogistica } from './lider-logistica';

describe('LiderLogistica', () => {
  let component: LiderLogistica;
  let fixture: ComponentFixture<LiderLogistica>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [LiderLogistica]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LiderLogistica);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
