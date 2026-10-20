.class public final Lz/i;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La0/u;


# direct methods
.method public synthetic constructor <init>(La0/u;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lz/i;->a:I

    iput-object p1, p0, Lz/i;->b:La0/u;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    iget v0, p0, Lz/i;->a:I

    iget-object v1, p0, Lz/i;->b:La0/u;

    packed-switch v0, :pswitch_data_0

    check-cast p2, Lz/x;

    iget-object p2, p2, Lz/x;->j:Ljava/lang/Object;

    invoke-interface {v1, p2}, La0/u;->b(Ljava/lang/Object;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    check-cast p1, Lz/x;

    iget-object p1, p1, Lz/x;->j:Ljava/lang/Object;

    invoke-interface {v1, p1}, La0/u;->b(Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2, p1}, Ld7/t;->J(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_0
    check-cast p2, Lz/x;

    iget-object p2, p2, Lz/x;->j:Ljava/lang/Object;

    invoke-interface {v1, p2}, La0/u;->b(Ljava/lang/Object;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    check-cast p1, Lz/x;

    iget-object p1, p1, Lz/x;->j:Ljava/lang/Object;

    invoke-interface {v1, p1}, La0/u;->b(Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2, p1}, Ld7/t;->J(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_1
    check-cast p1, Lz/x;

    iget-object p1, p1, Lz/x;->j:Ljava/lang/Object;

    invoke-interface {v1, p1}, La0/u;->b(Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast p2, Lz/x;

    iget-object p2, p2, Lz/x;->j:Ljava/lang/Object;

    invoke-interface {v1, p2}, La0/u;->b(Ljava/lang/Object;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, Ld7/t;->J(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_2
    check-cast p1, Lz/x;

    iget-object p1, p1, Lz/x;->j:Ljava/lang/Object;

    invoke-interface {v1, p1}, La0/u;->b(Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast p2, Lz/x;

    iget-object p2, p2, Lz/x;->j:Ljava/lang/Object;

    invoke-interface {v1, p2}, La0/u;->b(Ljava/lang/Object;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, Ld7/t;->J(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
