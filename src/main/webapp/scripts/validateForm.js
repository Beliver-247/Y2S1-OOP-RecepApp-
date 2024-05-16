function validateForm() {
    var nic = document.getElementById('NIC').value.trim();
    var fullName = document.getElementById('fullname').value.trim();
    var age = document.getElementById('age').value.trim();
    var gender = document.getElementById('gender').value;
    var mobilePhone = document.getElementById('Mphone').value.trim();
    var homePhone = document.getElementById('Hphone').value.trim();
    var address = document.getElementById('address').value.trim();
    var bloodType = document.getElementById('bloodtype').value.trim();
    var insuranceProvider = document.getElementById('insurance').value.trim();
    var password = document.getElementById('pass').value.trim();

    var nicError = document.getElementById('nicError');
    var fullnameError = document.getElementById('fullnameError');
    var ageError = document.getElementById('ageError');
    var genderError = document.getElementById('genderError');
    var mobilePhoneError = document.getElementById('MphoneError');
    var homePhoneError = document.getElementById('HphoneError');
    var addressError = document.getElementById('addressError');
    var bloodtypeError = document.getElementById('bloodtypeError');
    var insuranceError = document.getElementById('insuranceError');
    var passwordError = document.getElementById('passwordError');

    // Validate NIC
    if (nic.length !== 10 && nic.length !== 12) {
        nicError.textContent = 'NIC must be either 10 or 12 characters long.';
        nicError.style.display = 'block';
        return false;
    } else {
        nicError.style.display = 'none';
    }

    // Validate Full Name
    if (fullName.split(' ').length < 2) {
        fullnameError.textContent = 'Please enter both first name and last name.';
        fullnameError.style.display = 'block';
        return false;
    } else {
        fullnameError.style.display = 'none';
    }

    // Validate Age
    if (isNaN(age) || age <= 0) {
        ageError.textContent = 'Age must be a positive number.';
        ageError.style.display = 'block';
        return false;
    } else {
        ageError.style.display = 'none';
    }

    // Validate Gender
    if (gender === '') {
        genderError.textContent = 'Please select a gender.';
        genderError.style.display = 'block';
        return false;
    } else {
        genderError.style.display = 'none';
    }

        // Validate Mobile Phone
    if (mobilePhone.length !== 10 || isNaN(mobilePhone)) {
        mobilePhoneError.textContent = 'Mobile phone number must be 10 digits and contain only numbers.';
        mobilePhoneError.style.display = 'block';
        return false;
    } else {
        mobilePhoneError.style.display = 'none';
    }

    // Validate Home Phone
    if (homePhone.length !== 10 || isNaN(homePhone)) {
        homePhoneError.textContent = 'Home phone number must be 10 digits and contain only numbers.';
        homePhoneError.style.display = 'block';
        return false;
    } else {
        homePhoneError.style.display = 'none';
    }

    // Validate Address
    if (address === '') {
        addressError.textContent = 'Please enter your address.';
        addressError.style.display = 'block';
        return false;
    } else {
        addressError.style.display = 'none';
    }

    // Validate Blood Type
    if (bloodType === '' || (bloodType.length !== 1 && bloodType.length !== 2)) {
        bloodtypeError.textContent = 'Blood type should be one or two characters.';
        bloodtypeError.style.display = 'block';
        return false;
    } else {
        bloodtypeError.style.display = 'none';
    }

    // Validate Insurance Provider (optional)
    if (insuranceProvider === '') {
        insuranceError.textContent = 'Please enter your insurance provider.';
        insuranceError.style.display = 'block';
        return false;
    } else {
        insuranceError.style.display = 'none';
    }


    // Validate Password length and complexity
    if (password.length < 8 || !validatePasswordComplexity(password)) {
        passwordError.textContent = 'Password must have at least 8 characters and include one uppercase letter, one number, and one special character.';
        passwordError.style.display = 'block';
        return false;
    } else {
        passwordError.style.display = 'none';
    }

    return true; // Form is valid and can be submitted
}


//validate password 
function validatePasswordComplexity(password) {
    var hasCapitalLetter = false;
    var hasNumber = false;
    var hasSpecialChar = false;

    for (var i = 0; i < password.length; i++) {
        if (password[i] >= 'A' && password[i] <= 'Z') {
            hasCapitalLetter = true;
        }
        if (!isNaN(password[i])) {
            hasNumber = true;
        }
        //special characters
        if (!password[i].match(/^[0-9a-zA-Z]+$/)) {
            hasSpecialChar = true;
        }
    }

    return hasCapitalLetter && hasNumber && hasSpecialChar;
}

