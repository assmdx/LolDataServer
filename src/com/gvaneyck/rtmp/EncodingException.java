/*
  Copyright (C) 2012-2012 Gabriel Van Eyck

  This software is provided 'as-is', without any express or implied
  warranty.  In no event will the authors be held liable for any damages
  arising from the use of this software.

  Permission is granted to anyone to use this software for any purpose,
  including commercial applications, and to alter it and redistribute it
  freely, subject to the following restrictions:

  1. The origin of this software must not be misrepresented; you must not
     claim that you wrote the original software. If you use this software
     in a product, an acknowledgment in the product documentation would be
     appreciated but is not required.
  2. Altered source versions must be plainly marked as such, and must not be
     misrepresented as being the original software.
  3. This notice may not be removed or altered from any source distribution.

  Gabriel Van Eyck vaneyckster@gmail.com
 */

package com.gvaneyck.rtmp;
import java.io.IOException;

/**
 * A basic exception used within AMF3Encoder and AMF3Decoder to notify of
 * parsing problems.
 * 
 * @author Gabriel Van Eyck
 */
public class EncodingException extends IOException
{
	private static final long serialVersionUID = 1476074395589836889L;

	public EncodingException(String message)
	{
		super(message);
	}
}
