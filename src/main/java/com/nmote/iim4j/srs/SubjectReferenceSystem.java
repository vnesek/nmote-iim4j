/*
 * Copyright (c) Nmote Ltd. 2004-2014. All rights reserved. 
 * See LICENSE doc in a root of project folder for additional information.
 */

package com.nmote.iim4j.srs;

import java.util.Collection;

/**
 * SubjectReferenceSystem
 */
public interface SubjectReferenceSystem {

	SubjectReferenceSystem DEFAULT = StandardEN.create();

	SubjectReference get(String number);

	SubjectReference getParent(SubjectReference ref);

	String getName(SubjectReference ref);

	String getDescription(SubjectReference ref);

	Collection<SubjectReference> getChildren(SubjectReference ref);

	Collection<SubjectReference> getTopSubjectReferences();

	Collection<SubjectReference> getAllSubjectReferences();
}
