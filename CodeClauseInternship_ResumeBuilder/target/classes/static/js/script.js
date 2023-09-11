function addNewEfield() {

	let newNode = document.createElement('textarea');
	newNode.classList.add('form-control');
	newNode.classList.add('eduField');
	newNode.classList.add('mt-2');
	newNode.setAttribute('rows', 3);
	newNode.setAttribute('placeholder', 'Academic education');

	let aeOb = document.getElementById('ae');
	let aeBtnOb = document.getElementById('aeBtn');
	aeOb.insertBefore(newNode, aeBtnOb);
}
function addNewWEfield() {
	let newNode = document.createElement('textarea')
	newNode.classList.add('form-control');
	newNode.classList.add('workField');
	newNode.classList.add('mt-2');
	newNode.setAttribute('rows', 3);

	newNode.setAttribute('placeholder', 'Work experiences');
	let weOb = document.getElementById('we');
	let weBtnOb = document.getElementById('weBtn');
	weOb.insertBefore(newNode, weBtnOb);
}

let skillsList = new Array();
function addSkills() {
	let newSkill = document.createElement("button");
	newSkill.classList.add('mb-2');
	newSkill.classList.add('mt-2');
	newSkill.classList.add('mr-2');
	newSkill.classList.add('btn-outline-success');
	let skills = document.getElementById('skillsField').value

	newSkill.textContent = skills;
	let skill_container = document.getElementById('skill-label');
	let skills_input = document.getElementById('skills-input');
	skill_container.insertBefore(newSkill, skills_input);


	skillsList.push(newSkill.textContent);

}



function generateCV() {

	if ($('#emailField').val() == null) {
		
		$('#template').css("display", "none")
	}else{
		
	$('#template').css("display", "block")
	$('#print-btn').css("display", "block")
	let nameField = document.getElementById('nameField').value;
	let name = document.getElementById('name')
	name.innerHTML = nameField;


	// last name direct
	document.getElementById('lastname').innerHTML = document.getElementById('lastnameField').value
	document.getElementById('contact').innerHTML = document.getElementById('contactField').value
	document.getElementById('email').innerHTML = document.getElementById('emailField').value
	document.getElementById('link').innerHTML = document.getElementById('linkField').value
	document.getElementById('git').innerHTML = document.getElementById('gitlinkField').value
	document.getElementById('about').innerHTML = document.getElementById('aboutField').value

	let works = document.getElementsByClassName('workField');
	let str = '';
	for (let e of works) {
		str = str + `<li>${e.value}</li>`;
	}
	document.getElementById('work').innerHTML = str;


	let edu = document.getElementsByClassName('eduField')
	let stre = ''
	for (let e of edu) {
		stre = stre + `<li>${e.value}</li>`;
	}
	document.getElementById('edu').innerHTML = stre;
	document.getElementById('addi').innerHTML = document.getElementById('addiField').value
	console.log(skillsList)
	let strs = ''
	skillsList.forEach(element => {
		strs = strs + `<li>${element}</li>`
	});
	document.getElementById('skills').innerHTML = strs;
	}
	
	//set image
	let file=document.getElementById('imgField').files[0]
	console.log(file)
	let reader=new FileReader()
	reader.readAsDataURL(file)
	console.log(reader.result)
	
	
	reader.onloadend= function(){
		document.getElementById('img').src=reader.result;
	}
	
}

//print CV
function printCV() {
	$('#cv-form').hide();
	$('#print-btn').hide();
	let template = document.getElementById('template');
	template.classList.add('container-fluid');

	window.print();
}