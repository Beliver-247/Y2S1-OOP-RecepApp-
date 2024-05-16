function validNIC(){
	var nic = document.getElementById('chNIC').value.trim();
	
	    if (nic.length !== 10 && nic.length !== 12) {
        alert('NIC must be either 10 or 12 characters long.');
        return false;
    }
    
    return true;
}