
.method private final scanNodeAllApps(Landroid/view/accessibility/AccessibilityNodeInfo;Lcom/auto/accept/data/model/SupportedApp;)V
    .locals 24

    # ============================================================
    # Universal platform scanner (block 4).
    # 1) Runs the proven generic scanner first (unchanged behavior).
    # 2) Then an extra pass for platforms whose accept button is not
    #    labelled "accept"/"confirm" (start/take/pick/grab + Hindi).
    # Overlap guard: if any node text contains accept/confirm the
    # original scanner owns that popup and this pass returns early.
    # Decides through the existing processRideDecision bridge using
    # the engine's own conventions (0.0 = unknown for km slots).
    # Registers: invoke operands kept in v0..v13 (35c limit v15);
    # wide values in v16..v23. Frame v0..v12 assembled at :assemble.
    # ============================================================

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-wide/16 v22, 0x0

    invoke-direct {v0, v1}, Lcom/auto/accept/service/RideAcceptorService;->scanNodeForRapido(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0, v1, v3}, Lcom/auto/accept/service/RideAcceptorService;->fetchIterableNodes(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/util/List;)V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/4 v7, 0x0

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :loop
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :loop_end

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/accessibility/AccessibilityNodeInfo;

    const-string v8, ""

    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v11

    if-eqz v11, :after_text

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    :after_text
    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityNodeInfo;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v11

    if-eqz v11, :after_cd

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, " "

    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    :after_cd
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v14

    if-eqz v14, :loop

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v9

    const-string v10, "accept"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :guard_confirm

    return-void

    :guard_confirm
    const-string v10, "confirm"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :guard_done

    return-void

    :guard_done
    if-nez v7, :do_numbers

    const-string v10, "start"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_take

    goto :found_word

    :w_take
    const-string v10, "take"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_pick

    goto :found_word

    :w_pick
    const-string v10, "pick"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_grab

    goto :found_word

    :w_grab
    const-string v10, "grab"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_claim

    goto :found_word

    :w_claim
    const-string v10, "claim"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_order

    goto :found_word

    :w_order
    const-string v10, "order"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_book

    goto :found_word

    :w_book
    const-string v10, "book"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_approve

    goto :found_word

    :w_approve
    const-string v10, "approve"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_receive

    goto :found_word

    :w_receive
    const-string v10, "receive"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_continue

    goto :found_word

    :w_continue
    const-string v10, "continue"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_proceed

    goto :found_word

    :w_proceed
    const-string v10, "proceed"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_offer

    goto :found_word

    :w_offer
    const-string v10, "offer"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_hi1

    goto :found_word

    :w_hi1
    const-string v10, "\u0938\u094d\u0935\u0940\u0915\u093e\u0930"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_hi2

    goto :found_word

    :w_hi2
    const-string v10, "\u092a\u0941\u0937\u094d\u091f\u093f"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_hi3

    goto :found_word

    :w_hi3
    const-string v10, "\u0936\u0941\u0930\u0942"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_hi4

    goto :found_word

    :w_hi4
    const-string v10, "\u0938\u094d\u0935\u0940\u0915\u0943\u0924"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :w_hi5

    goto :found_word

    :w_hi5
    const-string v10, "\u092c\u0941\u0915"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :do_numbers

    goto :found_word

    :found_word
    const-string v10, "reject"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_pass

    goto :do_numbers

    :x_pass
    const-string v10, "pass"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_skip

    goto :do_numbers

    :x_skip
    const-string v10, "skip"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_decline

    goto :do_numbers

    :x_decline
    const-string v10, "decline"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_cancel

    goto :do_numbers

    :x_cancel
    const-string v10, "cancel"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_close

    goto :do_numbers

    :x_close
    const-string v10, "close"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_later

    goto :do_numbers

    :x_later
    const-string v10, "later"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_ignore

    goto :do_numbers

    :x_ignore
    const-string v10, "ignore"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_location

    goto :do_numbers

    :x_location
    const-string v10, "location"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_address

    goto :do_numbers

    :x_address
    const-string v10, "address"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_detail

    goto :do_numbers

    :x_detail
    const-string v10, "detail"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_km

    goto :do_numbers

    :x_km
    const-string v10, "km"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_kg

    goto :do_numbers

    :x_kg
    const-string v10, "kg"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_min

    goto :do_numbers

    :x_min
    const-string v10, "min"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_rupee

    goto :do_numbers

    :x_rupee
    const-string v10, "\u20b9"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_call

    goto :do_numbers

    :x_call
    const-string v10, "call"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_chat

    goto :do_numbers

    :x_chat
    const-string v10, "chat"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_more

    goto :do_numbers

    :x_more
    const-string v10, "more"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :x_size

    goto :do_numbers

    :x_size
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v14

    const/16 v15, 0x28

    if-gt v14, v15, :do_numbers

    invoke-direct {v0, v5}, Lcom/auto/accept/service/RideAcceptorService;->findClickableAncestor(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v11

    if-eqz v11, :do_numbers

    move-object v7, v11

    :do_numbers
    invoke-direct {v0, v8}, Lcom/auto/accept/service/RideAcceptorService;->extractDistance(Ljava/lang/String;)D

    move-result-wide v10

    cmpl-double v14, v10, v22

    if-lez v14, :currency

    cmpl-double v14, v18, v22

    if-nez v14, :dist_drop

    move-wide/from16 v18, v10

    goto :currency

    :dist_drop
    cmpl-double v14, v20, v22

    if-nez v14, :currency

    move-wide/from16 v20, v10

    :currency
    const-string v10, "\u20b9"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cur_dollar

    invoke-direct {v0, v8}, Lcom/auto/accept/service/RideAcceptorService;->extractAllNumbers(Ljava/lang/String;)Ljava/util/List;

    move-result-object v12

    goto :num_iter

    :cur_dollar
    const-string v10, "$"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cur_euro

    invoke-direct {v0, v8}, Lcom/auto/accept/service/RideAcceptorService;->extractAllNumbers(Ljava/lang/String;)Ljava/util/List;

    move-result-object v12

    goto :num_iter

    :cur_euro
    const-string v10, "\u20ac"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cur_none

    invoke-direct {v0, v8}, Lcom/auto/accept/service/RideAcceptorService;->extractAllNumbers(Ljava/lang/String;)Ljava/util/List;

    move-result-object v12

    goto :num_iter

    :cur_none
    goto/16 :loop

    :num_iter
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :num_loop
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :num_end

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Double;

    invoke-virtual {v11}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    cmpl-double v14, v10, v16

    if-lez v14, :num_loop

    move-wide/from16 v16, v10

    goto :num_loop

    :num_end
    goto/16 :loop

    :loop_end
    if-eqz v7, :end

    cmpl-double v14, v16, v22

    if-lez v14, :end

    cmpl-double v14, v18, v22

    if-gez v14, :norm_drop

    move-wide/from16 v18, v22

    :norm_drop
    cmpl-double v14, v20, v22

    if-gez v14, :assemble

    move-wide/from16 v20, v22

    :assemble
    move-object v9, v6

    move-object v10, v7

    const/4 v11, 0x0

    invoke-virtual {v2}, Lcom/auto/accept/data/model/SupportedApp;->getName()Ljava/lang/String;

    move-result-object v12

    move-wide/from16 v1, v16

    const-wide/16 v3, 0x0

    move-wide/from16 v5, v18

    move-wide/from16 v7, v20

    invoke-static/range {v0 .. v12}, Lcom/auto/accept/service/RideAcceptorService;->PLACEHOLDER_DECIDE(Ljava/lang/Object;DDDDLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :end
    return-void
.end method
