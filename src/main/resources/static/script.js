async function loadMembers() {
    const response = await fetch('/members'); // http response obj
    const members = await response.json();   // members is now an array of member objects

    const body = document.getElementById('memberBody');
    body.innerHTML = ""; //delete old table
    members.forEach(member => {
        let row = body.insertRow(); // this inserts to end by default
        let idCell = row.insertCell(0);
        let nameCell = row.insertCell(1);
        let hireDateCell = row.insertCell(2);
        let salaryCell = row.insertCell(3);
        let rateCell = row.insertCell(4);
        // better to use textContent over innerHTML bc a member with an html tag name may get interpreted as html
        idCell.textContent = member.id;
        nameCell.textContent = member.name;
        hireDateCell.textContent = member.hireDate;
        salaryCell.textContent = member.salary;
        rateCell.textContent = member.contributionRate;
    });
}

document.getElementById('add-member').addEventListener('submit', async (e) => {
    e.preventDefault();
    const newMember = {
        name: document.getElementById('NAME').value,
        hireDate:document.getElementById('hireDate').value,
        salary: document.getElementById('salary').value,
        contributionRate: document.getElementById('contributionRate').value,
    };
    await fetch("http://localhost:8080/members", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(newMember)
    })
    loadMembers();
});
