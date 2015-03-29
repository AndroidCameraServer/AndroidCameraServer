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
// Generated from file `genericData.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

public final class genericDataProviderHolder extends Ice.ObjectHolderBase<genericDataProvider>
{
    public
    genericDataProviderHolder()
    {
    }

    public
    genericDataProviderHolder(genericDataProvider value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof genericDataProvider)
        {
            value = (genericDataProvider)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _genericDataProviderDisp.ice_staticId();
    }
}