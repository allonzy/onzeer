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

public final class _ManageDelM extends Ice._ObjectDelM implements _ManageDel
{
    public void
    addFile(String name, int offset, byte[] bytes, int size, java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __observer)
        throws IceInternal.LocalExceptionWrapper
    {
        IceInternal.Outgoing __og = __handler.getOutgoing("addFile", Ice.OperationMode.Normal, __ctx, __observer);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.startWriteParams(Ice.FormatType.DefaultFormat);
                __os.writeString(name);
                __os.writeInt(offset);
                byteArrayHelper.write(__os, bytes);
                __os.writeInt(size);
                __og.endWriteParams();
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            if(__og.hasResponse())
            {
                try
                {
                    if(!__ok)
                    {
                        try
                        {
                            __og.throwUserException();
                        }
                        catch(Ice.UserException __ex)
                        {
                            throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                        }
                    }
                    __og.readEmptyParams();
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
        }
        finally
        {
            __handler.reclaimOutgoing(__og);
        }
    }

    public String[]
    findByName(String name, java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __observer)
        throws IceInternal.LocalExceptionWrapper
    {
        IceInternal.Outgoing __og = __handler.getOutgoing("findByName", Ice.OperationMode.Normal, __ctx, __observer);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.startWriteParams(Ice.FormatType.DefaultFormat);
                __os.writeString(name);
                __og.endWriteParams();
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            try
            {
                if(!__ok)
                {
                    try
                    {
                        __og.throwUserException();
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                    }
                }
                IceInternal.BasicStream __is = __og.startReadParams();
                String[] __ret;
                __ret = stringArrayHelper.read(__is);
                __og.endReadParams();
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __handler.reclaimOutgoing(__og);
        }
    }

    public String[]
    getFilesList(java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __observer)
        throws IceInternal.LocalExceptionWrapper
    {
        IceInternal.Outgoing __og = __handler.getOutgoing("getFilesList", Ice.OperationMode.Normal, __ctx, __observer);
        try
        {
            __og.writeEmptyParams();
            boolean __ok = __og.invoke();
            try
            {
                if(!__ok)
                {
                    try
                    {
                        __og.throwUserException();
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                    }
                }
                IceInternal.BasicStream __is = __og.startReadParams();
                String[] __ret;
                __ret = stringArrayHelper.read(__is);
                __og.endReadParams();
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __handler.reclaimOutgoing(__og);
        }
    }

    public Status
    getStatus(java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __observer)
        throws IceInternal.LocalExceptionWrapper
    {
        IceInternal.Outgoing __og = __handler.getOutgoing("getStatus", Ice.OperationMode.Normal, __ctx, __observer);
        try
        {
            __og.writeEmptyParams();
            boolean __ok = __og.invoke();
            try
            {
                if(!__ok)
                {
                    try
                    {
                        __og.throwUserException();
                    }
                    catch(Ice.UserException __ex)
                    {
                        throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                    }
                }
                IceInternal.BasicStream __is = __og.startReadParams();
                Status __ret;
                __ret = new Status();
                __ret.__read(__is);
                __og.endReadParams();
                return __ret;
            }
            catch(Ice.LocalException __ex)
            {
                throw new IceInternal.LocalExceptionWrapper(__ex, false);
            }
        }
        finally
        {
            __handler.reclaimOutgoing(__og);
        }
    }

    public void
    removeFile(String name, java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __observer)
        throws IceInternal.LocalExceptionWrapper
    {
        IceInternal.Outgoing __og = __handler.getOutgoing("removeFile", Ice.OperationMode.Normal, __ctx, __observer);
        try
        {
            try
            {
                IceInternal.BasicStream __os = __og.startWriteParams(Ice.FormatType.DefaultFormat);
                __os.writeString(name);
                __og.endWriteParams();
            }
            catch(Ice.LocalException __ex)
            {
                __og.abort(__ex);
            }
            boolean __ok = __og.invoke();
            if(__og.hasResponse())
            {
                try
                {
                    if(!__ok)
                    {
                        try
                        {
                            __og.throwUserException();
                        }
                        catch(Ice.UserException __ex)
                        {
                            throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                        }
                    }
                    __og.readEmptyParams();
                }
                catch(Ice.LocalException __ex)
                {
                    throw new IceInternal.LocalExceptionWrapper(__ex, false);
                }
            }
        }
        finally
        {
            __handler.reclaimOutgoing(__og);
        }
    }
}
