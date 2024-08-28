const readline = require('readline');

class Node{
    constructor(data, next){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    constructor(){
        this.head = null;
    }

    addNode = (data) => {
        const newNode = new Node(data);

        if(!this.head){
            this.head = newNode;
        }
        else{
            let current = this.head;
            while(current.next){
                current = current.next;
            }
            current.next = newNode;      
        }
    }

    printNode = () => {
        while(this.head){
            console.log(this.head.data);
            this.head = this.head.next;
        }
    }
}
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

createList = () => {
    let list = new LinkedList();

    getInput = () => {
        rl.question(`enter node value (-1 to break):`, (data) => {
            if(data === '-1'){
                rl.close();
                console.log(`list values:`);
                list.printNode();
            }

            else{
                list.addNode(parseInt(data), null);
                getInput();
            }
        })
    }
    getInput();
}

createList();
