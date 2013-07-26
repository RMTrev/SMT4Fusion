package com.rmtrev.SMT4Fusion;


/**
 * <p>
 * This class represents an unordered pair of strings.
 * In other words, (Fairy, Divine) == (Divine, Fairy)
 * </p>
 * <p>
 * The purpose of this class is to reduce the size of the fusion grid
 * by eliminating redundant entries.
 * </p>
 * 
 * @author Trevor Daniels
 *
 */
public class UPair
{
	private String left;
	private String right;
	
	public UPair(String l, String r)
	{
		if(l.compareTo(r) > 0)
		{
			left = r;
			right = l;
		}
		else
		{
			left = l;
			right = r;
		}
	}
	
	public String getLeft()
	{
		return left;
	}
	
	public String getRight()
	{
		return right;
	}
	
	@Override
	public int hashCode()
	{
		return left.hashCode() ^ right.hashCode();
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o == null) return false;
		if(!(o instanceof UPair)) return false;
		UPair p = (UPair) o;
		return (left.equals(p.left) && right.equals(p.right));
	}
}
