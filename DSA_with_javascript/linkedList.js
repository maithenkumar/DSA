// linkedlist class
class LinkedList {
	constructor()
	{
		this.head = null;
		this.size = 0;
	}

	// functions to be implemented
	add(element)
	// insertAt(element, location)
	// removeFrom(location)
	// removeElement(element)

	// Helper Methods
	// isEmpty
	// size_Of_List
	// PrintList

// adds an element at the end
// of list
add(element)
{
	// creates a new node
	var node = new Node(element);

	// to store current node
	var current;

	// if list is Empty add the
	// element and make it head
	if (this.head == null)
		this.head = node;
	else {
		current = this.head;

		// iterate to the end of the
		// list
		while (current.next) {
			current = current.next;
		}

		// add node
		current.next = node;
	}
	this.size++;
}
}