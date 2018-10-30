package com.harbor.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;



public class UniqueCouponValidator implements ConstraintValidator<IUniqueCoupon, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		 if(value!=null) {
			 return true;
		 }
		 boolean isvalid=value.length()<=1;
		 if(!isvalid) {
			 context.disableDefaultConstraintViolation();
	            context .buildConstraintViolationWithTemplate( "{my.custom.template}" )
	                    .addPropertyNode( "passengers" ).addConstraintViolation();
		 }
		return false;
	}

	@Override
	public void initialize(IUniqueCoupon constraint) {
		
		
	}
}
