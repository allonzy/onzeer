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

public interface ManagePrx extends Ice.ObjectPrx
{
    public void addFile(String name, int offset, byte[] bytes, int size);

    public void addFile(String name, int offset, byte[] bytes, int size, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_addFile(String name, int offset, byte[] bytes, int size);

    public Ice.AsyncResult begin_addFile(String name, int offset, byte[] bytes, int size, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_addFile(String name, int offset, byte[] bytes, int size, Ice.Callback __cb);

    public Ice.AsyncResult begin_addFile(String name, int offset, byte[] bytes, int size, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_addFile(String name, int offset, byte[] bytes, int size, Callback_Manage_addFile __cb);

    public Ice.AsyncResult begin_addFile(String name, int offset, byte[] bytes, int size, java.util.Map<String, String> __ctx, Callback_Manage_addFile __cb);

    public void end_addFile(Ice.AsyncResult __result);

    public void removeFile(String name);

    public void removeFile(String name, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_removeFile(String name);

    public Ice.AsyncResult begin_removeFile(String name, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_removeFile(String name, Ice.Callback __cb);

    public Ice.AsyncResult begin_removeFile(String name, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_removeFile(String name, Callback_Manage_removeFile __cb);

    public Ice.AsyncResult begin_removeFile(String name, java.util.Map<String, String> __ctx, Callback_Manage_removeFile __cb);

    public void end_removeFile(Ice.AsyncResult __result);

    public String[] getFilesList();

    public String[] getFilesList(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getFilesList();

    public Ice.AsyncResult begin_getFilesList(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getFilesList(Ice.Callback __cb);

    public Ice.AsyncResult begin_getFilesList(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getFilesList(Callback_Manage_getFilesList __cb);

    public Ice.AsyncResult begin_getFilesList(java.util.Map<String, String> __ctx, Callback_Manage_getFilesList __cb);

    public String[] end_getFilesList(Ice.AsyncResult __result);

    public String[] findByName(String name);

    public String[] findByName(String name, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_findByName(String name);

    public Ice.AsyncResult begin_findByName(String name, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_findByName(String name, Ice.Callback __cb);

    public Ice.AsyncResult begin_findByName(String name, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_findByName(String name, Callback_Manage_findByName __cb);

    public Ice.AsyncResult begin_findByName(String name, java.util.Map<String, String> __ctx, Callback_Manage_findByName __cb);

    public String[] end_findByName(Ice.AsyncResult __result);

    public Status getStatus();

    public Status getStatus(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getStatus();

    public Ice.AsyncResult begin_getStatus(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getStatus(Ice.Callback __cb);

    public Ice.AsyncResult begin_getStatus(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getStatus(Callback_Manage_getStatus __cb);

    public Ice.AsyncResult begin_getStatus(java.util.Map<String, String> __ctx, Callback_Manage_getStatus __cb);

    public Status end_getStatus(Ice.AsyncResult __result);
}