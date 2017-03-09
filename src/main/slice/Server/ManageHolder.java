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

public final class ManageHolder extends Ice.ObjectHolderBase<Manage>
{
    public
    ManageHolder()
    {
    }

    public
    ManageHolder(Manage value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof Manage)
        {
            value = (Manage)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _ManageDisp.ice_staticId();
    }
}
