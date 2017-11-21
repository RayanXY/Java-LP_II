public void printWords(int numWordsToPrint)
	{	
		printWord(numWordsToPrint, this.cursor);
	}
	
	/**
	 * Prints numWordsToPrint words starting from cursor. Method checks for children, then siblings.
	 * 
	 * @param numWordsToPrint	the number of words to print.
	 * @param node				the node to start from.
	 */
	public void printWord(int numWordsToPrint, TrieNode node)
	{		
		if (numWordsToPrint > 0 && node != null)									//Make sure node != null and numWordsToPrint is > 0
		{			
			if(node.isStartingPosition())											//Check to see if the node is the beginning of a word
			{
				printWord(node);													//If so, print the word and...
				numWordsToPrint--;													//decrement numWordsToPrint.				
			}
			
			if(node.getChild() != null)												//Check for a child first.
				printWord(numWordsToPrint, node.getChild());						//If child exists, call printWord with the child.
			else if(node.getSibling().getLetter() != '~')							//Check the sibling	exists and isn't the end of list marker.
				printWord(numWordsToPrint, node.getSibling());						//If sibling exists, call printWord with the sibling.
			else																	//No child or sibling existed, what to do?
			{
				TrieNode parent = getParent(node);									//Get parent.
				while(parent != root && parent.getSibling().getLetter() == '~')		//Make sure parent isn't root and parent's sibling isn't the EOL marker.
					parent = getParent(parent);										
				printWord(numWordsToPrint, parent.getSibling());					//Call printWord with parent's sibling.				
			}
		}
		else
		{
			if(node == null && numWordsToPrint > 0)	//More words specified than exist. Since all
			{
				this.cursor = null;					//words were printed, reset the cursor.
				System.out.println("No more words to print.\r");
			}
			else
				this.cursor = node;
		}
	}
	
	/**
	 * This method prints out a word whose first letter starts at node and traverses up 
	 * the trie until it reaches root, printing out each visited nodes letter along the way.
	 * 
	 * @param node	the node whose letter is the first letter of the word to be printed.
	 */
	private void printWord(TrieNode node)
	{
		while(node != this.root)
		{
			System.out.print(node.getLetter());
			node = getParent(node);			
		}
		System.out.println();
	}
}