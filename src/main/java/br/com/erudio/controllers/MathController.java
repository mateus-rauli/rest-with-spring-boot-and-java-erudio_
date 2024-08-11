package br.com.erudio.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exceptions.UnsupportedMathOperationException;
import br.com.erudio.math.SimpleMath;
import br.com.erudio.utils.Utils;

@RestController
public class MathController {
	
	private SimpleMath math = new SimpleMath();
	
	@GetMapping(value = "/sum/{numberOne}/{numberTwo}")
	public Double sum(
			@PathVariable() String numberOne,
			@PathVariable() String numberTwo
			) throws Exception {
		if(!Utils.isNumeric(numberOne)||!Utils.isNumeric(numberTwo)) 
		{ 
			throw new UnsupportedMathOperationException("Please, set a numeric value");
		}
		
		
		return math.sum(Utils.convertToDouble(numberOne), Utils.convertToDouble(numberTwo));
	}
	
	@GetMapping(value = "/subtraction/{numberOne}/{numberTwo}")
	public Double subtraction(@PathVariable() String numberOne, @PathVariable() String numberTwo) throws Exception 
	{
		if(!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo)) 
		{
			throw new UnsupportedMathOperationException("Please, set a numeric value");
		}
		
		return math.subtraction(Utils.convertToDouble(numberOne),Utils.convertToDouble(numberTwo));
	}
	
	@GetMapping(value = "/multiplication/{numberOne}/{numberTwo}")
	public Double multiplication(@PathVariable() String numberOne, @PathVariable() String numberTwo) throws Exception
	{
		if(!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo)) 
		{
			throw new UnsupportedMathOperationException("Please, set a numeric value");
		}
		
		return math.multiplication(Utils.convertToDouble(numberOne),Utils.convertToDouble(numberTwo));
	}
	
	@GetMapping(value = "/division/{numberOne}/{numberTwo}")
	public Double division(@PathVariable() String numberOne, @PathVariable() String numberTwo) throws Exception
	{
		if(!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo)) 
		{
			throw new UnsupportedMathOperationException("Please, set a numeric value");
		}
		
		return math.division(Utils.convertToDouble(numberOne), Utils.convertToDouble(numberTwo));
	}
	
	@GetMapping(value = "/average/{numberOne}/{numberTwo}")
	public Double average(@PathVariable() String numberOne, @PathVariable() String numberTwo) throws Exception
	{
		if(!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo)) 
		{
			throw new UnsupportedMathOperationException("Please, set a numeric value");
		}
		
		return math.average(Utils.convertToDouble(numberOne), Utils.convertToDouble(numberTwo));
	}
	
	@GetMapping(value = "/square-root/{number}")
	public Double squareRoot(@PathVariable() String number) throws Exception
	{
		if(!Utils.isNumeric(number)) 
		{
			throw new UnsupportedMathOperationException("Please, set a numeric value");
		}
		
		return math.squareRoot(Utils.convertToDouble(number));
	}
}
