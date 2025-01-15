package in.krrishit.Controller;


import org.springframework.web.bind.annotation.RestController;

import in.krrishit.binding.Passenger;
import in.krrishit.binding.Ticket;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class RestApiController {
	
	private Map<Integer , Ticket> tickets=new HashMap<>();
	@PostMapping(
			 value ="/ticket",
			 consumes = {"application/xml" , "application/json"},
			 produces = {"application/xml" , "application/json"}
			 
			
			)
    public Ticket bookTicket(@RequestBody Passenger passenger)
	{
		Ticket t=new Ticket();
		
		Random r=new Random();
		int ticketId=r.nextInt();
		
		
		t.setTicketId(ticketId);
		t.setFrom(passenger.getFrom());
		t.setTo(passenger.getTo());
		t.setTicketStatus("CONFIRMED");
		t.setTrainNum(passenger.getTrainNum());
		t.setTktCost("1500.000 INR");
		
		tickets.put(ticketId,t);
		
		return t;
		 
	}
	
	@GetMapping(
			value="/ticket/{ticketId}",
			
			produces = {"application/xml" , "application/json"}
			
			
			)
	
	public Ticket getTicket(@PathVariable Integer ticketId)
	{
		if(tickets.containsKey(ticketId))
		{
			return tickets.get(ticketId);
		}
		return null; 
	}
	
	


}
