// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `Server.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package Server;

public abstract class Callback_Manage_getStatus extends Ice.TwowayCallback
{
    public abstract void response(Status __ret);

    public final void __completed(Ice.AsyncResult __result)
    {
        ManagePrx __proxy = (ManagePrx)__result.getProxy();
        Status __ret = null;
        try
        {
            __ret = __proxy.end_getStatus(__result);
        }
        catch(Ice.LocalException __ex)
        {
            exception(__ex);
            return;
        }
        response(__ret);
    }
}
