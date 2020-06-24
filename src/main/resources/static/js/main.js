/**
 * 
 */

$('document').ready(function(){	
	$('.table .btn-warning').on('click',function(event){	
		
		event.preventDefault();
		
		var href = $(this).attr('href');
		
		$.get(href, function(flight,status){
			$('#flightIdEdit').val(flight.flightId);
			$('#flightNameEdit').val(flight.flightName); 
			$('#sourceEdit').val(flight.source);
			$('#destinationEdit').val(flight.destination);
			$('#noOfSeatsEdit').val(flight.noOfSeats);
			$('#arrivedOnEdit').val(flight.arrivedOn);
			$('#departureByEdit').val(flight.departureBy);
		});
		
		$('#editModal').modal();				
	});	
	
	$('.table #deleteButton').on('click',function(event){
		event.preventDefault();		
		var href = $(this).attr('href');
		$('#deleteModal #delRef').attr('href', href);		
		$('#deleteModal').modal();
	});   
});